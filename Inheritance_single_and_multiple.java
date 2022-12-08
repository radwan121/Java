package Codes;
//folder name: Codes
 
import java.util.*; 

//GEO_SHAPE CLASS 
//GEO_SHAPE IS A FATHER CLASS 
class Geo_shape
{ 
    protected int tri_angles = 180; 
    protected int tri_sides = 3; 
    protected int quad_angles = 360; 
    protected int quad_sides = 4; 
};

//TRIANGLE CLASS 
//TRIANGLE CLASS IS CHILD CLASS
//CHILD USING THE PROPERTIES OF FATHER CLASS
class triangle extends Geo_shape
//SINGLE INHERITANCE
    {
         protected void print_triangle() 
        {  
            System.out.println("\n"+"Triangle properties : "); 
            System.out.println("Total angle : "+tri_angles); 
            System.out.println("Number of sides : "+tri_sides); 
        } 
    } 

//QUADELATERAL CLASS
//CHILD CLASS INHERITING FATHER CLASS GEOSHAPE
class quad extends Geo_shape
//SINGLE INHERITANCE
    {
        protected void print_quads() 
        { 
            System.out.println("\n"+"Quadelateral properties : "); 
            System.out.println("Total angle : "+quad_angles); 
            System.out.println("Number of sides : "+quad_sides); 
        } 
    } 

//DERIVED SQUARE CLASS
class square extends quad 
//MULTIPLE INHERITANCE
{ 
    protected void print_square() 
    {  
        System.out.println("\n"+"Square properties : "); 
        // System.out.println("Total square sides : "+quad_sides);
        System.out.println("All sides of the square have same length"); 
    } 
} 

//DERIVED RECTANGLE CLASS 
class rectangle extends quad
//MULTIPLE INHERITANCE
    { 
        protected void print_rect() 
        { 
            System.out.println("\n"+"Rectangle properties : "); 
            System.out.println("Total square sides : "+quad_sides); 
            System.out.println("Two parallel sides of the rectangle have same length"); 
        } 
    } 
public class Inheritance_single_and_multiple
//FILE NAME Inheritance_single_and_multiple
{ 
    public static void main(String[] args) 
    { 
        //CREATING OBJECTS 
        triangle tri = new triangle(); 
        tri.print_triangle(); 
        // quad quads = new quad();
        // quads.print_quads();
        rectangle rect = new rectangle(); 
        rect.print_quads();
        //RECT CLASS USING THE PROPERTY OF QUAD CLASS, 
        //WHERE QUAD IS USING THE PROPERTIES OF GEO SHAPE CLASS
        rect.print_rect(); 
        square squ = new square(); 
        squ.print_quads(); 
        squ.print_square(); 
    } 
} 