/*
Create a program in java that will take 3 inputs of football players. Inputs are: name, age, 
country, goal scored, distance covered. Then it’ll print all info along with total match played, 
average goal scored, average distance covered and average speed.
*/

import java.util.*;

public class Player_statistic
{
    //DECLARING VARIABLES
    private String player_name, player_country;
    private int player_age, match, distance_covered, goals_scored, mins_played;
    private float avg_goal, avg_speed, avg_distance;
    //CONSTRUCTERS
    public Player_statistic(String plname, int age, String plcountry)
    {
        match=goals_scored=mins_played=distance_covered=0;
        player_name = plname;
        player_country = plcountry;
        player_age = age;
    }
    //ADD MATCH
    public void addmatch(int goals, int dist, int plmins)
    {
        match++;
        goals_scored += goals;
        distance_covered += dist;
        mins_played = plmins;
    }
    //AVERAGE STATS
    public void avgstat()
    {   
        avg_goal = goals_scored/match;
        avg_speed = distance_covered/mins_played;
        avg_distance = distance_covered/match;
    }
    //SHOW STATS
    public void information()
    {   
        System.out.println("Player name: " + player_name);
        System.out.println("Player age: " + player_age);
        System.out.println("Country: " + player_country);
        System.out.println("Matches played: " + match);
        System.out.println("Goals Scored: " + goals_scored);
        System.out.println("Disctance Covered: " + distance_covered);
        System.out.println("Minuites Played: " + mins_played);
        avgstat();
        System.out.println("Average Goal: " + avg_goal);
        System.out.println("Average Speed: " + avg_speed);
        System.out.println("Average Distance Covered: " + avg_distance);
    }
    //MAIN PROGRAM
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String plname,plcountry;
        int dist,goals,plmins,age,num;
        System.out.print("Enter number of players: ");
        num = input.nextInt();
        player[] pl = new player[num] ;
        for(int i = 0; i<num; i++)
        {
            System.out.print("Enter name: ");
            plname = input.nextLine();
            System.out.print("Enter age: ");
            age = input.nextInt();
            input.nextLine();
            System.out.print("Enter country: ");
            plcountry = input.nextLine();
            input.nextLine();
            //INITIALIZING CONSTRUCTORS
            pl[i] = new player(plname, age, plcountry);
        }
    }
}
