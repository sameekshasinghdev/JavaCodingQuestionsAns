package cracckifyFlyWeightDP;

public class Main {

	public static void main(String[] args) {

		TreeType mangoType = TreeFactory.getTreeType("Mango", "Green", "Smooth");

		TreeType mangoType2 = TreeFactory.getTreeType("Mango", "Green", "Smooth");

		TreeType oakType = TreeFactory.getTreeType("Oak", "Dark Green", "Rough");

		Tree tree1 = new Tree(10, 20, mangoType);
		Tree tree2 = new Tree(30, 40, mangoType2);
		Tree tree3 = new Tree(50, 60, oakType);

		tree1.draw();
		tree2.draw();
		tree3.draw();

		System.out.println("Same Mango TreeType? " + (tree1.getTreeType() == tree2.getTreeType()));
	}
}