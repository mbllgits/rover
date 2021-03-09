package com.nasa.mars;

public class Rover {
	private Position position;
	private Plateau plateau;

	public void put(String input) throws Exception {
		String[] inputs = input.split(" ");
		int x = Integer.parseInt(inputs[0]);
		int y = Integer.parseInt(inputs[1]);
		char heading = inputs[2].toCharArray()[0];
		Position position = new Position(x, y, heading);
		boolean putInPlateau = position.isInPlateau(plateau);
		if (putInPlateau) {
			this.position = position;
		} else
			throw new Exception("Position wrong");
	}

	public Position getPosition() {
		return position;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}

	public void doActions(char[] actions) throws Exception {
		for (char action : actions) {
			switch (action) {
			case 'L':
				turnLeft();
				break;

			case 'M':
				move();
				break;

			case 'R':
				turnRight();
				break;

			default:
				throw new RuntimeException("Action not supported");
			}
		}
		System.out.println(this.position.toString());
	}

	public void turnLeft() {

		switch (position.getHeading()) {

		case 'N':
			position.setHeading('O');
			break;
		case 'S':
			position.setHeading('E');
			break;
		case 'E':
			position.setHeading('N');
			break;
		case 'O':
			position.setHeading('S');
			break;
		}
	}

	public void turnRight() {
		switch (position.getHeading()) {
		case 'N':
			position.setHeading('E');
			break;
		case 'S':
			position.setHeading('O');
			break;
		case 'E':
			position.setHeading('S');
			break;
		case 'O':
			position.setHeading('N');
			break;
		}
	}

	public void move() throws Exception {
		position.moveM();
		if (!position.isInPlateau(plateau))

		{
			throw new RuntimeException("Plateau Area exceeded ");
		}

	}
}