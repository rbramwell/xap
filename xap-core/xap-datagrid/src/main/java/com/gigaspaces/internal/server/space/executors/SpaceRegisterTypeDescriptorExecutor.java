/*
 * Copyright (c) 2008-2016, GigaSpaces Technologies, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gigaspaces.internal.server.space.executors;

import com.gigaspaces.internal.server.space.SpaceImpl;
import com.gigaspaces.internal.space.requests.RegisterTypeDescriptorRequestInfo;
import com.gigaspaces.internal.space.requests.SpaceRequestInfo;
import com.gigaspaces.internal.space.responses.RegisterTypeDescriptorResponseInfo;
import com.gigaspaces.internal.space.responses.SpaceResponseInfo;
import com.gigaspaces.security.authorities.SpaceAuthority;
import com.j_spaces.core.DetailedUnusableEntryException;

/**
 * Registers type descriptors.
 *
 * @author Niv Ingberg
 * @since 8.0
 */
@com.gigaspaces.api.InternalApi
public class SpaceRegisterTypeDescriptorExecutor extends SpaceActionExecutor {
    @Override
    public SpaceResponseInfo execute(SpaceImpl space, SpaceRequestInfo spaceRequestInfo) {
        RegisterTypeDescriptorRequestInfo requestInfo = (RegisterTypeDescriptorRequestInfo) spaceRequestInfo;
        RegisterTypeDescriptorResponseInfo responseInfo = new RegisterTypeDescriptorResponseInfo();

        try {
            space.getEngine().registerTypeDesc(requestInfo.typeDescriptor, requestInfo.isFromGateway());
        } catch (DetailedUnusableEntryException e) {
            responseInfo.exception = e;
        }
        return responseInfo;
    }

    @Override
    public SpaceAuthority.SpacePrivilege getPrivilege() {
        return SpaceAuthority.SpacePrivilege.ALTER;
    }
}
