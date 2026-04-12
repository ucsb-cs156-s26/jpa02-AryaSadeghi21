package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_for_same_object() {
        Team t = new Team("A");
        t.addMember("m1");
        assertTrue(t.equals(t));
    }

    @Test
    public void equals_returns_false_for_different_class() {
        Team t = new Team("A");
        assertFalse(t.equals("not a team"));
    }

    @Test
    public void equals_returns_false_for_null() {
        Team t = new Team("A");
        assertFalse(t.equals(null));
    }

    @Test
    public void equals_returns_true_when_name_and_members_match() {
        Team t1 = new Team("A");
        t1.addMember("m1");
        Team t2 = new Team("A");
        t2.addMember("m1");
        assertTrue(t1.equals(t2));
    }

    @Test
    public void equals_returns_false_when_name_matches_but_members_differ() {
        Team t1 = new Team("A");
        t1.addMember("m1");
        Team t2 = new Team("A");
        t2.addMember("m2");
        assertFalse(t1.equals(t2));
    }

    @Test
    public void equals_returns_false_when_name_differs_but_members_match() {
        Team t1 = new Team("A");
        t1.addMember("m1");
        Team t2 = new Team("B");
        t2.addMember("m1");
        assertFalse(t1.equals(t2));
    }

    @Test 
    public void hashCode_returns_same_value_for_equal_objects() {
        Team t1 = new Team("A");
        t1.addMember("m1");
        Team t2 = new Team("A");
        t2.addMember("m1");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

   @Test
   public void hashCode_specfic_test() {
    Team t = new Team("A");
    t.addMember("0");
    int result = t.hashCode();
    int expectedResult = 79;
    assertEquals(expectedResult, result);
   }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
