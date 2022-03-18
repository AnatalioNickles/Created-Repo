import java.util.ArrayList;
//import java.util.ListIterator;

public class ArrayShows {

	public static void main(String[] args) {

		ArrayList<String> favShows = new ArrayList<String>();

		favShows.add("Super Cool Action Show");
		favShows.add("Lame Watching Snow Melt Show");
		favShows.add("Over the Top Japanese Game Show");
		favShows.add("There's a Snake in My Boot");
		favShows.add("How to Rob a Bank With Your Friends");
		favShows.add("Sundial Show");
		/*
		 * for(int i = 0; i <= favShows.size()-1 ; i++) {
		 * 
		 * System.out.println(favShows.get(i)); }
		 * 
		 * System.out.println("-- -- -- -- -- -- -- -- --");
		 * 
		 * for(String show : favShows) {
		 * 
		 * System.out.println(show); }
		 * 
		 * System.out.println("-- -- -- -- -- -- -- -- --");
		 * 
		 * ListIterator iterate = favShows.listIterator();
		 * 
		 * while(iterate.hasNext()) {
		 * 
		 * System.out.println(iterate.next()); }
		 * 
		 * System.out.println("-- -- -- -- -- -- -- -- --");
		 * 
		 * favShows.forEach(favShow -> System.out.println(favShow));
		 */

		System.out.println("\nI have " + favShows.size() + " favorite shows!");

		System.out.println(favShows);

		for (String show : favShows) {
			if (show.equalsIgnoreCase("Friends")) {
				System.out.println("\nFriends is listed as a favorite TV Show!");
				break;
			} else {
				System.out.println(
						"\nFriends is such an old show that there are not any recordings left of it anywhere in the world!");
				break;
			}
		}
		System.out.println("\nThe first listing on my favorite televesion show list is '" + favShows.get(0) + "'.");

		System.out.println("\nThe last on my list of favorites is '" + favShows.get(favShows.size() - 1) + "'.");

		favShows.set(3, "100,000 Flaps of Timmy the Fly's Wings");
		System.out.println(
				"\nI no longer watch 'There's a Snake in My Boot', instead I enjoy a new show.  Here is the new list:");
		System.out.println(favShows);

		favShows.add(0, "Hola Alejandro!");

		System.out.println(
				"\nI have recently discovered an amazing new spanish telenovela "
				+ "and \nhave added it as my most favorite show. See below:");
		System.out.println(favShows);

		System.out.println("\nMy list of favorite television shows is empty(T/F)? " + favShows.isEmpty());

		System.out.println(
				"\nNetflix is making too much money! !  I will show them! They will be "
				+ "totally surprised when I delete my list of favorite shows!");
		System.out.println("Behold, my new favorite list: ");
		favShows.clear();
		System.out.println(favShows + "'s size is " + favShows.size() + ".");

	}
}
