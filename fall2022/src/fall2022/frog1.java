package fall2022;
//this is the object where we control via keyboard
//and user frogger
public class frog1 extends sprite{
	
private Boolean visible, moving;
	private int lives;
	public frog1() {
		super(0, 0, 100, 100, "greenfrog.png");
		this.visible = true;
		this.moving = false;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Boolean getMoving() {
		return moving;
	}

	public void setMoving(Boolean moving) {
		this.moving = moving;
	}
	
	public void show() {
		this.visible = true;
	}
	public void hide() {
		this.visible = false;
	}
	
	public void display() {
		System.out.println("x, y: "+ this.x + "," + this.y);

	}
	public void SetLives(int lives) {
		this.lives = lives;
	}
	public int GetLives() {
		return lives;
	}
}
	
