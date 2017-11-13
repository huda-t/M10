package com.cs2340.team6.totallyratticalapp;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;



import android.support.test.rule.ActivityTestRule;

/**
 * Sample JUnit test cases for BST.
 *
 * @version 1.0
 * @author CS 1332 TAs
 */
public class usernameTests {
    @Test
    public void testUsernameFalse() {
        CSVReader csv = new CSVReader();
        User user = new User("Sally", "Sally", "Sally", User.Role.USER);
        csv.addUser(user);
        assertFalse(csv.usernameAvailable("Sally"));
    }

    @Test
    public void testUsernameTrue() {
        CSVReader csv = new CSVReader();
        assertTrue(csv.usernameAvailable("4579435jkfdgkdfbncmvbx"));
    }
}