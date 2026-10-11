# Cosmic Defender

Cosmic Defender is a small, keyboard-controlled arcade shooter built in Java with Swing. Pilot a ship across the bottom of the screen, fire at incoming enemies, and avoid letting them reach you.

This project was created as a programming project and is a demonstration of my work with object-oriented Java, desktop interfaces, and basic game-loop mechanics.

## Gameplay

- Move the player ship left and right along the bottom of the play area.
- Fire projectiles upward at enemies.
- Dodge three falling enemy types: a basic enemy, a tank, and a fast precision enemy.
- Projectiles and enemies are removed from play when they leave the screen or collide.

### Controls

| Key | Action |
| --- | --- |
| Left Arrow or **A** | Move left |
| Right Arrow or **D** | Move right |
| **Space** | Fire |

## Built with

- **Java** (Java 8 or newer)
- **Swing** for the game window, drawing surface, keyboard input, and timer-driven game loop
- **AWT** for graphics, colors, dimensions, and rectangle-based collision detection

## Running the game

### From the command line

Install a JDK, open a terminal at the repository root, then compile and launch the game:

```bash
cd "Lab Per 4 - Cosmic Defender"
javac *.java
java GameFrame
```

### With BlueJ

Open the `Lab Per 4 - Cosmic Defender` folder as a BlueJ project, then run the `GameFrame` class.

## How it is organized

The project uses a shared `GameObject` base class for objects with a position, size, active state, update behavior, and drawing behavior. `Player`, `Enemy`, and `Projectile` specialize that base class; `Tank` and `Precision` extend `Enemy`. `GamePanel` owns the game loop, object collection, enemy spawning, input handling, rendering, and collision checks, while `GameFrame` creates the application window.

## Skills and concepts practiced

- Applying **inheritance, abstraction, encapsulation, and polymorphism** to game entities.
- Keeping entity behavior in classes with separate update and draw methods.
- Creating a desktop interface and handling keyboard events with Java Swing.
- Updating and rendering a simple real-time game with a Swing timer.
- Managing collections of active objects and safely removing inactive objects while iterating.
- Detecting collisions with `Rectangle` bounds.
- Breaking a project into cooperating classes and testing gameplay through repeated runs.

## Project status

This is a playable prototype. It currently has no score display, enemy health/damage system, or game-over/restart screen. The `Tank` and `Precision` classes establish enemy variants, but their health fields are not yet connected to collision behavior.

## Possible next steps

- Add a score and player lives.
- Implement enemy health and different hit behavior for enemy types.
- Add a game-over state and restart option.
- Improve visuals with sprites, animation, and sound.
