//For a given array of random numbers given from standard input,
// perform a shift of all zeros at the beginning of the sequence.
// Print the transformed array to standard output.

import java.util.Scanner;

public class PushZero
{
    static void pushZerosToBeginning(int arr[], int n)  // funkcijata prima niza od broevi i dolzinata na nizata
    {
        int pom;
        for(int i=0; i <n;i++){
            pom = arr[i];

            if(pom==0){

            }
        }


        for(int i=0; i <n;i++) {
            System.out.print(arr[i]);
        }


    /*
    Ova mi beshe incijalnata idea, no potrebno e kako ke se pomesti nulata, site clenovi od nizata ponataka da se pomestat
    nemoze da se menjaat nulite so clenovite vo nizata
        int pom,j=0,pom2;

        for(int i=0; i <n;i++){
            pom = arr[i];

            if(pom==0){
                pom2=arr[j];
                arr[j]=arr[i];
                arr[i]=pom2;
                j++;
            }
        }
     */

    }

    public static void main (String[] args)
    {
        int b;
        Scanner scanner = new Scanner(System.in); // skener za JAVA programi
        b= scanner.nextInt();   // kolku clena ke ima nizata

        int arr[]=new int [b]; // inicijalizacija na nizata, taa ke ima 'b' memoriski mesta

        for(int i = 0 ; i<b;i++)
        {
            arr[i]=scanner.nextInt(); // vnesuvanje an sekoj clen od nizata
        }

        pushZerosToBeginning(arr,b); // povikuvanje na funkcijata sho ke ja ispecati nizata taka shto site 0 ke bidat an pocetok an nizata


    }
}