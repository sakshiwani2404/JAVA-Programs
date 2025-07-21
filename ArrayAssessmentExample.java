class ArrayAssessmentExample
{
	public static void main(String[] args) {
		int[] distance={50,55,60};
		int [] targetDistance={60,55,50,65};
		for(int i=0;i<targetDistance.length;i++)
		{
			int sum=0;
			for(int j=0;j<distance.length;j++)
				sum+=targetDistance[i]-distance[j]>0?targetDistance[i]-distance[j]:(-1)*(targetDistance[i]-distance[j]);
			//Math.absolute
			System.out.println(i+": "+sum);
		}
	}
}