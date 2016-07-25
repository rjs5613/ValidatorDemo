package com.talentica.event;

import org.junit.Ignore;
import org.junit.Test;

import com.talentica.base.Validator;
import com.talentica.domain.Event;
import com.talentica.domain.Game;
import com.talentica.exception.ValidationException;
import com.talentica.impl.EventValidator;
import com.talentica.impl.GameValidator;

public class ValidationTest {

	@Ignore
	@Test
	public void testEvant() {
		Validator<Event> eventValidator = new EventValidator();
		Event event = new Event();
		event.setValidator(eventValidator);
		try {
			event.validate();
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testGame() {
		Validator<Game> eventValidator = new GameValidator();
		Game game = new Game();
		game.setValidator(eventValidator);
		try {
			game.validate();
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
		}
	}

}
