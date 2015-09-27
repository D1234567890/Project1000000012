import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

import javax.swing.*;

public class GridWorld {
	public static void main(String[] args) {
		GridWorld h = new GridWorld();
	}

	GridWorld() {
		int a = new Random().nextInt(10);
		int q = new Random().nextInt(10);
		int io = new Random().nextInt(4);
		World w = new World();
		w.show();
		Bug b = new Bug();
		Location kl = new Location(a, q);
		b.setColor(Color.blue);
		Location l = new Location(5, 5);
		w.add(kl, b);
		Bug c = new Bug();
		c.setColor(Color.green);
		w.add(l, c);
		for (int i = 0; i < io; i++) {
			c.turn();
		}
		Flower flower = new Flower();
		flower.setColor(Color.magenta);
		Flower fllower = new Flower(Color.black);
		Location ll = new Location(a + 1, q);
		Location lll = new Location(a - 1, q);
		w.add(ll, flower);
		w.add(lll, fllower);
		for (int ii = 0; ii <= 9; ii++) {
			for (int iii = 0; iii <= 9; iii++) {
				Location llll = new Location(ii,iii);
				w.add(llll, fllower);
			}
		}

	}
}