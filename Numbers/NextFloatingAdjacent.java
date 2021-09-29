
public class NextFloatingAdjacent {

	public static void main(String[] args) {
		float fpn = 0.2f;
		float fpn_next_up = Math.nextUp(fpn);
		float fpn_next_down = Math.nextDown(fpn);
		double dpn = 0.2d;
		double dpn_next_up = Math.nextDown(dpn);
		double dpn_next_down = Math.nextUp(dpn);
		System.out.println(fpn_next_up+", "+fpn_next_down+", "+dpn_next_up+", and "+dpn_next_down);
	}

}
