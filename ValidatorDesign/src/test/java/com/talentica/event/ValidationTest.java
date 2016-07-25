package com.talentica.event;

import org.junit.Test;

import com.talentica.base.Validator;
import com.talentica.domain.Event;
import com.talentica.domain.Game;
import com.talentica.exception.ValidationException;
import com.talentica.impl.EventValidator;
import com.talentica.impl.GameValidator;

public class ValidationTest {

	@Test(expected = ValidationException.class)
	public void testEvant() throws ValidationException {
		Validator<Event> eventValidator = new EventValidator();
		Event event = new Event();
		event.setValidator(eventValidator);
		event.validate();
	}

	@Test(expected = ValidationException.class)
	public void testGame() throws ValidationException {
		Validator<Game> eventValidator = new GameValidator();
		Game game = new Game();
		game.setValidator(eventValidator);
		game.validate();
	}

}
