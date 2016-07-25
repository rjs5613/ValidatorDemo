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
public class Game implements Validable<Game> {

	private String name;

	private String region;

	private Validator<Game> validator;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public void setValidator(Validator<Game> validator) {
		this.validator = validator;

	}

	@Override
	public void validate() throws ValidationException {
		if (Objects.isNull(validator)) {
			throw new ValidationException("No Validato Set For Game");
		}
		validator.validate(this);

	}

}
