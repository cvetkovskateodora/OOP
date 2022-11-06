package zadacha1;

public class main extends Student {

			public static void main(String[] args) {
				Student object1 = new Student();
				object1.firstName="Теодора";
				object1.lastName="Цветковска";
				object1.index=58;
				
				System.out.println("Податоци за прв објект: ");
				System.out.println(object1.firstName + " " + object1.lastName + " " + object1.index);
				
				Student object2 = new Student("Елеонора","Ивановска",22);
				
				System.out.println("Податоци за втор објект: ");
				System.out.println(object2.firstName + " " + object2.lastName + " " + object2.index);
			}
		}

