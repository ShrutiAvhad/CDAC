package sorting;

class Merge_Ver1 {

		private static void Merge_ver1(int tar[], int arr1[], int arr2[]) {
			
			int i = 0, j = 0, k = 0;
			while((i < arr1.length) && (j < arr2.length))
			{
				if(arr1[i] < arr2[j])
				{
					tar[k] = arr1[i];
					i++; k++;
				}
				else if(arr1[i] > arr2[j])
				{
					tar[k] = arr2[j];
					j++; k++;
				}
				else
				{
					tar[k] = arr1[i];
					i++;j++; k++;
				}
			}
			
			while(i < arr1.length)
			{
				tar[k] = arr1[i];
				i++; k++;
			}
			
			while(j < arr2.length)
			{
				tar[k] = arr2[j];
				j++; k++;
			}	
		}
	
	public static void main(String[] args) {
		    
		    int arr1[] = {1, 3, 5, 7, 3, 72, 43};
		    int arr2[] = {2, 4, 6, 5, 65, 8};

		    int tar[] = new int[arr1.length + arr2.length];

		    Merge_ver1(tar, arr1, arr2);

		    System.out.println("Merged Array:");
		    for(int i = 0; i < tar.length; i++)
		    {
		        System.out.print(tar[i] + " ");
		    }
		}	
}
