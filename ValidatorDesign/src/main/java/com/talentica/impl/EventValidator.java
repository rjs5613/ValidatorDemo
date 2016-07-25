/**
 * 
 */
package com.talentica.impl;

import com.talentica.base.Validator;
import com.talentica.domain.Event;
import com.talentica.exception.ValidationException;

/**
 * Concrete Implementation of Event Validator
 * 
 * @author RajeshK
 *
 */
public class EventValidator implements Validator<Event> {

	@Override
	public void validate(Event event) throws ValidationException {
		if (event.getName() == null || event.getName().length() < 5) {
			throw new ValidationException("Name Should be atleast 5 character");
		}

		if (event.getOwner() == null || event.getOwner().length() == 0) {
			throw new ValidationException("Owner Can't Be Null or Empty");
		}

	}

}
