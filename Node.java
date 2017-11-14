public class nodeClass {
	

		public double numbers;
		public nodeClass next;
		
		public nodeClass(double numbers, nodeClass next){
			this.numbers = numbers;
			this.next = next;
		}
		public double getNum()
		{
				return numbers;
		}
		public String toString() {
			return + numbers + "";
					
		}
		public void display() {
			System.out.println("Set1: " + numbers);
			System.out.println("Set2: " + next);
		}
		
		
	
}
