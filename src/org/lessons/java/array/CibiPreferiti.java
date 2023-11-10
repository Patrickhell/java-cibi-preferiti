package org.lessons.java.array;

public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		String[] myFavoriteFoods = { "pasta", "riso", "lasagna", "pollo", "spaghetti"};
		
		int length  = myFavoriteFoods.length;
		
		System.out.println("La lunghezza dell'array è: " + length);
		
		System.out.println("my top food is : " + myFavoriteFoods[2]);
		
		System.out.println("my lees top food is : " + myFavoriteFoods[myFavoriteFoods.length- 1]);
		
		int medIndex = myFavoriteFoods.length / 2; //2.5
		boolean evenArray = myFavoriteFoods.length % 2 == 0; //resto 0.5: quindi dispari
		
		System.out.println("Cibo med: " + (
				evenArray 
				? myFavoriteFoods[medIndex - 1] + " ~ " + myFavoriteFoods[medIndex]
				: myFavoriteFoods[medIndex]
        //essendo evenArray dispari si avrà: myFavoriteFoods[medIndex]; cioè: il cibo all'indice 2 che è: lasagna
		// se la lunghezza dell'array fosse 6, evenArray sarebbe pari quindi si avrebbe: myFavoriteFoods[medIndex - 1] + " ~ " + myFavoriteFoods[medIndex]
		// cibo med = myFavoriteFoods[3 - 1] + " ~ " + myFavoriteFoods[3] = myFavoriteFoods[2] + " ~ " + myFavoriteFoods[3]
		// cibo med = lasagna ~ pollo
						
		));
		
	}
		
}


