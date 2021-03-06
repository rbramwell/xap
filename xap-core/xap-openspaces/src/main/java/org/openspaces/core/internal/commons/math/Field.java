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

package org.openspaces.core.internal.commons.math;

/**
 * Interface representing a <a href="http://mathworld.wolfram.com/Field.html">field</a>. <p> Classes
 * implementing this interface will often be singletons. </p>
 *
 * @param <T> the type of the field elements
 * @version $Revision: 811685 $ $Date: 2009-09-05 13:36:48 -0400 (Sat, 05 Sep 2009) $
 * @see FieldElement
 * @since 2.0
 */
public interface Field<T> {

    /**
     * Get the additive identity of the field. <p> The additive identity is the element
     * e<sub>0</sub> of the field such that for all elements a of the field, the equalities a +
     * e<sub>0</sub> = e<sub>0</sub> + a = a hold. </p>
     *
     * @return additive identity of the field
     */
    T getZero();

    /**
     * Get the multiplicative identity of the field. <p> The multiplicative identity is the element
     * e<sub>1</sub> of the field such that for all elements a of the field, the equalities a
     * &times; e<sub>1</sub> = e<sub>1</sub> &times; a = a hold. </p>
     *
     * @return multiplicative identity of the field
     */
    T getOne();

}
