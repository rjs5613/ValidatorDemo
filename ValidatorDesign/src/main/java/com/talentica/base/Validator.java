/**
 * 
 */
package com.talentica.base;

import com.talentica.exception.ValidationException;

/**
 * @author RajeshK
 *
 */
public interface Validator<T> {

	/**
	 * Validates The Object Based on the defined Rule
	 * 
	 * @param t
	 * @throws ValidationException
	 */
	void validate(T t) throws ValidationException;

}
