package ee.ut.cs.swt.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleGT {

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 1885);
	    String string0 = triangle0.classify();
	    assertEquals("isossceles", string0);
	    assertEquals("3,3,1885", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-434), 2);
	    triangle0.setSideLengths(324, 1244, 3740);
	    double double0 = triangle0.getArea();
	    assertEquals(5308, triangle0.getPerimeter());
	    assertEquals(36968.56069689487, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateralAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsIsoscelesIsFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    triangle0.setSideLengths(1886, (-3251), 1121);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(triangle0.isScalene());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsIsoscelesIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    triangle0.setSideLengths(1886, 1886, 231);
	    triangle0.classify();
	    assertEquals(4003, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    Triangle triangle1 = triangle0.setSideLengths(1379, 1379, 1379);
	    int int0 = triangle1.getPerimeter();
	    assertFalse(triangle0.isImpossible());
	    assertEquals(4137, int0);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    Triangle triangle1 = triangle0.setSideLengths(1379, 1379, 1379);
	    boolean boolean0 = triangle1.isImpossible();
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-434), 2);
	    double double0 = triangle0.getArea();
	    assertEquals((-1.0), double0, 0.01);
	    assertEquals("2,-434,2", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertEquals("-392,-392,0", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereGetPerimeterIsZero() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    triangle0.setSideLengths(0, 0, 0);
	    assertEquals("0,0,0", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsEquilateralAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsIsoscelesIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1948, 1948, 1948);
	    Triangle triangle1 = triangle0.setSideLengths((-2703), (-2703), (-2005));
	    boolean boolean0 = triangle1.isEquilateral();
	    assertEquals((-7411), triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsImpossible() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    triangle0.setSideLengths(1098, 1098, 0);
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals(2196, triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testIsImpossible1() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-434), (-434));
	    boolean boolean0 = triangle0.isImpossible();
	    assertTrue(boolean0);
	    assertEquals((-866), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengthsAndIsScaleneReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(1948, 1948, 1948);
	    triangle0.setSideLengths((-2703), (-1817), (-1817));
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals("-2703,-1817,-1817", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle((-18), (-294), (-18));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals("-18,-294,-18", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengthsAndSetSideLengthsWithNegativeAndSetSideLengthsWithPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(2, 2, 2);
	    triangle0.setSideLengths((-1), 0, 1294);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("-1,0,1294", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertEquals("-392,-392,0", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(533, (-646), (-646));
	    int int0 = triangle0.getPerimeter();
	    assertEquals((-759), int0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    Triangle triangle1 = triangle0.setSideLengths(1379, 1379, 1379);
	    int int0 = triangle1.getPerimeter();
	    assertFalse(triangle0.isImpossible());
	    assertEquals(4137, int0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsWithZero() throws Throwable {
	    Triangle triangle0 = new Triangle((-2286), (-2286), 2);
	    triangle0.setSideLengths(0, (-624), 2);
	    triangle0.classify();
	    assertEquals((-622), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles2() throws Throwable {
	    Triangle triangle0 = new Triangle((-4391), (-4391), (-4391));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals((-13173), triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsosceles0() throws Throwable {
	    Triangle triangle0 = new Triangle((-18), (-294), (-18));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals("-18,-294,-18", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles1() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-434), (-434));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals((-866), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-434), 2);
	    double double0 = triangle0.getArea();
	    assertEquals((-1.0), double0, 0.01);
	    assertEquals("2,-434,2", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengths0() throws Throwable {
	    Triangle triangle0 = new Triangle(1948, 1948, 1948);
	    triangle0.setSideLengths(3089, 740, 1381);
	    triangle0.classify();
	    assertFalse(triangle0.isIsosceles());
	}

	@Test(timeout = 4000)
	public void testIsImpossibleAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    triangle0.setSideLengths(1098, 1098, 0);
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals(2196, triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengths1() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-434), 2);
	    triangle0.setSideLengths(324, 1244, 3740);
	    triangle0.classify();
	    assertEquals(36968.56069689487, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle((-4391), (-4391), (-4391));
	    triangle0.setSideLengths((-4391), 871, (-2144463548));
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(triangle0.isIsosceles());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScalene0() throws Throwable {
	    Triangle triangle0 = new Triangle((-19), (-423), (-423));
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals((-865), triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScalene1() throws Throwable {
	    Triangle triangle0 = new Triangle((-28), (-294), (-28));
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals((-350), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengthsAndSetSideLengthsWithPositiveAndSetSideLengthsWithNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(2, 2, 2);
	    Triangle triangle1 = triangle0.setSideLengths(2, 0, (-1));
	    boolean boolean0 = triangle1.isIsosceles();
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScalene2() throws Throwable {
	    Triangle triangle0 = new Triangle((-4391), (-4391), (-4391));
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals((-13173), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-434), 2);
	    triangle0.setSideLengths(324, 1244, 3740);
	    double double0 = triangle0.getArea();
	    assertEquals(5308, triangle0.getPerimeter());
	    assertEquals(36968.56069689487, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsImpossible0() throws Throwable {
	    Triangle triangle0 = new Triangle((-4391), (-4391), (-4391));
	    boolean boolean0 = triangle0.isImpossible();
	    assertTrue(boolean0);
	    assertEquals((-13173), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle(1948, 1948, 1948);
	    Triangle triangle1 = triangle0.setSideLengths((-2703), (-2703), (-2005));
	    boolean boolean0 = triangle1.isEquilateral();
	    assertEquals((-7411), triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals("1886,1886,1886", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    String string0 = triangle0.getSideLengths();
	    assertEquals("1886,1886,1886", string0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereIsEquilateralIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(2, (-434), 2);
	    assertEquals("2,-434,2", triangle0.getSideLengths());
	    triangle0.setSideLengths(2, 2, 2);
	    String string0 = triangle0.classify();
	    assertEquals("equilateral", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle((-19), (-423), (-423));
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals((-865), triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengthsAndSetSideLengthsWithPositive() throws Throwable {
	    Triangle triangle0 = new Triangle((-4391), (-4391), (-4391));
	    triangle0.setSideLengths((-4391), 871, (-2144463548));
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(triangle0.isIsosceles());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsImpossible() throws Throwable {
	    Triangle triangle0 = new Triangle((-4391), (-4391), (-4391));
	    boolean boolean0 = triangle0.isImpossible();
	    assertTrue(boolean0);
	    assertEquals((-13173), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengthsAndSetSideLengthsWithPositiveAndSetSideLengthsWithPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    triangle0.setSideLengths(1886, (-3251), 1121);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals((-244), triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1), (-1));
	    triangle0.setSideLengths(1, 1, 1);
	    double double0 = triangle0.getArea();
	    assertFalse(triangle0.isImpossible());
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 1885);
	    String string0 = triangle0.classify();
	    assertEquals("isossceles", string0);
	    assertEquals("3,3,1885", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals("1886,1886,1886", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengthsAndSetSideLengthsWithNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(1948, 1948, 1948);
	    triangle0.setSideLengths(1948, 1068, (-2703));
	    triangle0.classify();
	    assertTrue(triangle0.isScalene());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle(2, 2, 2);
	    Triangle triangle1 = triangle0.setSideLengths(2, 0, (-1));
	    boolean boolean0 = triangle1.isIsosceles();
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(1886, 1886, 1886);
	    String string0 = triangle0.getSideLengths();
	    assertEquals("1886,1886,1886", string0);
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengthsAndSetSideLengthsWithZeroAndSetSideLengthsWithZero() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    triangle0.setSideLengths(2799, 0, 0);
	    triangle0.classify();
	    assertEquals("2799,0,0", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-392), (-392), 0);
	    triangle0.setSideLengths(0, 0, 0);
	    assertEquals("0,0,0", triangle0.getSideLengths());
	}

}