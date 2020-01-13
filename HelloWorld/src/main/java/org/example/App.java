package org.example;
import software.amazon.codeguruprofilerjavaagent.Profiler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new Profiler.Builder()
                .profilingGroupName("Java")
                .build().start();
        System.out.println( "Hello AWSCodeGuru!. Lets start testing" );
        int a = 0;
        String SECRET_KEY = "AENASDNaondad";
        String ACCESS_KEY = "adinasdnaosnd";
    }
}
