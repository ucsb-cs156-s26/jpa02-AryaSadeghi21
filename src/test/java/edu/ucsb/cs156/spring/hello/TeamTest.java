package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("s26-13", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Arya"),"Team should contain Arya");
        assertTrue(t.getMembers().contains("Joaquin W"),"Team should contain Joaquin W");
        assertTrue(t.getMembers().contains("Nick"),"Team should contain Nick");
        assertTrue(t.getMembers().contains("Pranav"),"Team should contain Pranav");
        assertTrue(t.getMembers().contains("Rohan"),"Team should contain Rohan");
        assertTrue(t.getMembers().contains("Safwan"),"Team should contain Safwan");
    }


   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
