
/**
 * The RunBenchmark class has been set up to allow you to do some simple tests on "Big O" estimates of
 * effort for two common algorithms/solutions to quiz 11.
 * 
 * In this makeup assignment you must first complete the code for the two methods "findSecondLowestSimple"
 * and "findSecondLowestHash", and then run each method using various array sizes from 10 to 1000000
 * 
 * For each method, record the array size, and the execution time, and graph as an x y graph with the x axis the array size, and the 
 * y axis the execution time in msec.
 * 
 * You can use the example call to getLowest as a model for how to set up each test for the findSecondLowestSimple and findSecondLowestHash
 * methods. Note that for the getLowest I first set a start time in nano seconds, then call the method, then create a seond time as the
 * current time in nano seconds minus the start time. Once the method has completed, I print the results.
 * 
 * You can read a short informative explanation of big O notation here:
 * https://rob-bell.net/2009/06/a-beginners-guide-to-big-o-notation/
 * 
 * For each of your methods, do you think they are O(1), O(N), O(N^2), O(2^N), or some other O()?  Explain your answer.
 * 
 * 
 * DELIVERABLES:
 * 
 * On one piece of paper, include:
 * 
 *   a table for each method that includes the array size in the left column, and the execution time in the right column. 
 *   a single graph of the results of each method based on the tables
 *   the complete code for each of the completed methods, including method signature
 *   Your big O estimate for each method, along with explanation
 *   
 *   I do not want the source code in bluej project format.
 */
public class RunBenchmark
{

    RandAry rA;
    int nums[];
    
    public long RunBenchmark()
    {
     for(int i = 1; i < 100000000; i = i * 10){
         System.out.println(RunBenchmark1(i));
        }
         return -1;
    }
    
    public long RunBenchmark1(int testSize)
    {
        rA=new RandAry(testSize);
        nums=rA.getRandAry();

        long startTime = System.nanoTime();
        int result=findSecondLowestHash(nums, 2); //K is an arbitrary value, and based on array, performance may change
        long deltaT=(System.nanoTime()-startTime)/1000;
        return deltaT;
      //  System.out.println("Lowest value: "+result+"\nfor testSize="+testSize+ " completed in "+deltaT+" msec");
    }

    
    public void printA(){
        rA.printRandAry();
    }

    public int getLowest(int a[]){
        int lowest=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]<lowest) {
                lowest=a[i];
            }
        }
        return lowest;
    }

    /**
     * findSecondLowestSimple - loop through an integer array twice, once to find the lowest value, and second to find the second lowest
     * 
     * @param a[] an integer array of random values
     * @return the value of the second lowest element in the array
     **/   
    public int findSecondLowestSimple(int a[]){

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==smallest){
                secondSmallest = smallest;
            } else if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest) {
                secondSmallest = a[i];
            }

        }

        return secondSmallest;

    }

    /**
     * findSecondLowestHash - store boolean values in a hash table that represents the array. Values are initally false, and then set to true at the
     * index 1 below the value of the element from the original array.  For instance if a[5]=3, then the boolean value at hash[2] would be set to true.
     * 
     * @param a[] an integer array of random values
     * @param k, the kth lowest position in the array
     * @return the value of the kth lowest element in the array
     **/  
    public  int findSecondLowestHash(int a[], int k){
        int counter = 0;
        boolean[] array = new boolean[a.length -1];
        for(int i = 0; i < array.length; i++){
            array[i] = true;
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] == true){
                counter++;
            }
            if(counter == k){
                return i + 1;
            }
        }

        return -1;
        /*
         *For these tests, you are provided a random array "a" with possible array values in the range [1,a.length+1].
         *
         * Algorithm for findSecondLowestHash
         * 
         * 1 create a boolean array the size of the random array being searched. Note, boolean array elements are initialized to false
         * 2 for each element in the search array, a, set the hashtable at element a[i] -1 to true
         * 3 Step through the hashtable, starting at element 0. For each element set to true, increment a counter variable.  Test the counter
         *   variable at each step against the parameter k, where k represents the kth lowest element. 
         * 4 if the counter variable equals k, return the curent index +1 (note that in step 2, each hash is shifted by -1.)
         * 5 if you get to the end of the array and 
         */

    }
}
