/**
 * 
 */
package com.talentica.domain;

import java.util.Objects;

import com.talentica.base.Validable;
import com.talentica.base.Validator;
import com.talentica.exception.ValidationException;

/**
 * @author RajeshK
 *
 */
public class Event implements Validable<Event> {

	private String name;

	private String owner;

	private Validator<Event> validator;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public void setValidator(Validator<Event> validator) {
		this.validator = validator;

	}

	@Override
	public void validate() throws ValidationException {
		if (Objects.isNull(validator)) {
			throw new ValidationException("No Validator Set for Event");
		}
		validator.validate(this);

	}

}
