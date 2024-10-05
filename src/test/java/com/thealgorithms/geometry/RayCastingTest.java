package com.thealgorithms.geometry;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class RayCastingTest {

    @Test
    void testPointInsidePolygon() {
        RayCasting rayCasting = new RayCasting();
        RayCasting.Point point = new RayCasting.Point(1, 1); // Point to test
        RayCasting.Point[] polygon = {
            new RayCasting.Point(0, 0),
            new RayCasting.Point(0, 2),
            new RayCasting.Point(2, 2),
            new RayCasting.Point(2, 0)
        };

        assertTrue(rayCasting.isPointInside(point, polygon), "Point should be inside the polygon");
    }

    @Test
    void testPointOutsidePolygon() {
        RayCasting rayCasting = new RayCasting();
        RayCasting.Point point = new RayCasting.Point(3, 3); // Point to test
        RayCasting.Point[] polygon = {
            new RayCasting.Point(0, 0),
            new RayCasting.Point(0, 2),
            new RayCasting.Point(2, 2),
            new RayCasting.Point(2, 0)
        };

        assertFalse(rayCasting.isPointInside(point, polygon), "Point should be outside the polygon");
    }

    @Test
    void testPointOnEdge() {
        RayCasting rayCasting = new RayCasting();
        RayCasting.Point point = new RayCasting.Point(0, 1); // Point on the edge
        RayCasting.Point[] polygon = {
            new RayCasting.Point(0, 0),
            new RayCasting.Point(0, 2),
            new RayCasting.Point(2, 2),
            new RayCasting.Point(2, 0)
        };

        // Depending on how your algorithm is set up, this may return true or false
        // Adjust the expected outcome based on your implementation
        assertFalse(rayCasting.isPointInside(point, polygon), "Point on edge should not be considered inside");
    }
}
