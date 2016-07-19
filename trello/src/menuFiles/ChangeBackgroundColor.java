package menuFiles;

import boardCreation.ColorSelector;
import boardCreation.Colors;

public class ChangeBackgroundColor {	
	/*
	BLUE,
	ORANGE,
	GREEN,
	RED,
	PURPLE,
	PINK,
	LIGHT_GREEN,
	SKY_BLUE,
	GRAY
	*/
	public static class Purple{
		public static void Select(){
			ColorSelector.Select(Colors.PURPLE);
		}
	}	
	public static class Blue{
		public static void Select(){
			ColorSelector.Select(Colors.BLUE);
		}
	}	
	public static class Orange{
		public static void Select(){
			ColorSelector.Select(Colors.ORANGE);
		}
	}
	public static class Green{
		public static void Select(){
			ColorSelector.Select(Colors.GREEN);
		}
	}	
	public static class Red{
		public static void Select(){
			ColorSelector.Select(Colors.RED);
		}
	}
	public static class Pink{
		public static void Select(){
			ColorSelector.Select(Colors.PINK);
		}
	}
	public static class Light_Green{
		public static void Select(){
			ColorSelector.Select(Colors.LIGHT_GREEN);			
		}
	}
	public static class Sky_Blue{
		public static void Select(){
			ColorSelector.Select(Colors.SKY_BLUE);
		}
	}
	public static class Gray{
		public static void Select(){
			ColorSelector.Select(Colors.GRAY);
		}
	}
}
