package headfirst13.facade.hometheater;

/**
 * @Class：
 * @Description:
 * 可以理解为“项目经理模式”，项目经理手下有很多打工仔，项目经理不需要知道具体的事怎么做
 * （数据库连接，dao编写，spring管理，页面开发。。。），他只关心自己的业务：完成项目。
 * 所以他要做的事情就是按开发计划安排打工仔们工作：
 * （a-> 设计数据库
 *   b-> dao层开发
 *   c-> 业务层开发
 *   d-> 页面开发
 *   .......
 * ）
 * 而具体打工仔们该干什么，他们都是靠这个吃饭的自然知道怎么干，不用经理担心。
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 10 Nov 2010 15:34:01
 * Revision history:
 *
 * @see 	 
 */
public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd, 
						projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
