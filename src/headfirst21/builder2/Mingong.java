package headfirst21.builder2;

//民工。负责进行具体部件如窗户，地板的建造。 
//同时因为房子是民工建的，因此建设完成后由他把房子递交回房主   
public class Mingong implements Builder {

	private String	window	= "";
	private String	floor	= "";

	public void makeWindow() {
		window = new String("window");
	}

	public void makeFloor() {
		floor = new String("floor");
	}

	// 回交房子给房主
	public Room getRoom() {
		if ((!window.equals("")) && (!floor.equals(""))) {
			System.out.println("room ready!");
			return new Room();
		}
		else
			return null;
	}
}
