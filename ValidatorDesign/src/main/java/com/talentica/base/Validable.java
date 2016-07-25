/**
 * 
 */
package com.talentica.base;

import com.talentica.exception.ValidationException;

/**
 * Interface to mark if a Class can be validated
 * 
 * @author RajeshK
 *
 */
public interface Validable<T> {

	/**
	 * Sets The Validator For the Class
	 * 
	 * @param validator
	 */
	void setValidator(Validator<T> validator);

	/**
	 * Validates
	 * 
	 * @throws ValidationException
	 */
	void validate() throws ValidationException;

}
