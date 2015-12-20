package Code;

//: enumerated/NotClasses.java
// {Exec: javap -c LikeClasses}
import static Util.Print.*;

enum CarClasses {
	MARUTI {
		void behavior() {
			print("Behavior1");
		}
	},
	FOXWAGEN {
		void behavior() {
			print("Behavior2");
		}
	},
	ZEN {
		void behavior() {
			print("Behavior3");
		}
	};
	abstract void behavior();
}

public class NotClasses {
	 void f1(LikeClasses instance) {} // Nope
} 

/*
 * Output: Compiled from "NotClasses.java" abstract class LikeClasses extends
 * java.lang.Enum{ public static final LikeClasses WINKEN;
 * 
 * public static final LikeClasses BLINKEN;
 * 
 * public static final LikeClasses NOD; ...
 */// :~
