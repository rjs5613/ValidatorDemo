/**
 * 
 */
package com.talentica.impl;

import com.talentica.base.Validator;
import com.talentica.domain.Game;
import com.talentica.exception.ValidationException;

/**
 * @author RajeshK
 *
 */
public class GameValidator implements Validator<Game> {

	@Override
	public void validate(Game game) throws ValidationException {
		if (game.getName() == null || game.getName().length() == 0) {
			throw new ValidationException("Game Name Can't be null");
		}

	}

}
