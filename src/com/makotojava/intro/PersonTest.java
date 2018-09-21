package com.makotojava.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Person p = new Person("Sane", "Miracle", 19, 173, 74, "Brown", "Male");
		Logger l = Logger.getLogger(Person.class.getName());
		l.info(" First Name: " + p.getFirstName());
		l.info("Last Name: " + p.getLastName());
		l.info("Age: " + p.getAge());
		l.info("Height: " + p.getHeight());
		l.info("Weight: " + p.getWeight());
		l.info("Eye Color: " + p.getEyeColor());
		l.info("Gender: " + p.getGender());
		assertEquals("Sane", p.getFirstName());
		assertEquals("Miracle", p.getLastName());
		assertEquals(19, p.getAge());
		assertEquals(173, p.getHeight());
		assertEquals(74, p.getWeight());
		assertEquals("Brown", p.getEyeColor());
		assertEquals("Male", p.getGender());
		
	}

}
