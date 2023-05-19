package XXLChess;


//import org.reflections.Reflections;
//import org.reflections.scanners.Scanners;
import processing.core.PApplet;
import processing.core.PImage;
import processing.data.JSONObject;
import processing.data.JSONArray;
import processing.core.PFont;
import processing.event.MouseEvent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.awt.Font;
import java.io.*;
import java.util.*;

public class App extends PApplet {

    public static final int SPRITESIZE = 480;
    public static final int CELLSIZE = 48;
    public static final int SIDEBAR = 120;
    public static final int BOARD_WIDTH = 14;

    public static int WIDTH = CELLSIZE*BOARD_WIDTH+SIDEBAR;
    public static int HEIGHT = BOARD_WIDTH*CELLSIZE;

    public static final int FPS = 60;
	
    public String configPath;
    public Game game;
    public Piece piece;
    // public PImage image;
    //images

    public PImage b_amazon_image;
    public PImage b_archbishop_image;
    public PImage b_bishop_image;
    public PImage b_camel_image;
    public PImage b_chancellor_image;
    public PImage b_king_image;
    public PImage b_knight_king_image;
    public PImage b_knight_image;
    public PImage b_pawn_image;
    public PImage b_queen_image;
    public PImage b_rook_image;
    public PImage w_amazon_image;
    public PImage w_archbishop_image;
    public PImage w_bishop_image;
    public PImage w_camel_image;
    public PImage w_chancellor_image;
    public PImage w_king_image;
    public PImage w_knight_king_image;
    public PImage w_knight_image;
    public PImage w_pawn_image;
    public PImage w_queen_image;
    public PImage w_rook_image;

    //all pieces objects

    public Piece b_amazon;
    public Piece b_archbishop;
    public Piece b_bishop;
    public Piece b_camel;
    public Piece b_chancellor;
    public Piece b_king;
    public Piece b_knight_king;
    public Piece b_knight;
    public Piece b_pawn;
    public Piece b_queen;
    public Piece b_rook;
    public Piece w_amazon;
    public Piece w_archbishop;
    public Piece w_bishop;
    public Piece w_camel;
    public Piece w_chancellor;
    public Piece w_king;
    public Piece w_knight_king;
    public Piece w_knight;
    public Piece w_pawn;
    public Piece w_queen;
    public Piece w_rook;

    public App() {
        this.configPath = "config.json";
        // this.game = new Game(this); //passing the instnace of the app into game (so we can use all the images and functions from the app)
    }

    /**
     * Initialise the setting of the window size.
    */
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    /**
     * Load all resources such as images. Initialise the elements such as the player, enemies and map elements.
    */

    public void loadImages() {

        this.b_pawn_image = loadImage("src/main/resources/XXLChess/b-pawn.png");
        this.b_queen_image = loadImage("src/main/resources/XXLChess/b-queen.png");
        this.b_rook_image = loadImage("src/main/resources/XXLChess/b-rook.png");
        this.w_amazon_image = loadImage ("src/main/resources/XXLChess/w-amazon.png");
        this.w_archbishop_image = loadImage("src/main/resources/XXLChess/w-archbishop.png");
        this.w_bishop_image = loadImage("src/main/resources/XXLChess/w-bishop.png");
        this.w_camel_image = loadImage("src/main/resources/XXLChess/w-camel.png");
        this.w_chancellor_image = loadImage("src/main/resources/XXLChess/w-chancellor.png");
        this.w_king_image = loadImage("src/main/resources/XXLChess/w-king.png");
        this.w_knight_king_image = loadImage("src/main/resources/XXLChess/w-knight-king.png");
        this.w_knight_image = loadImage("src/main/resources/XXLChess/w-knight.png");
        this.w_pawn_image = loadImage("src/main/resources/XXLChess/w-pawn.png");
        this.w_queen_image = loadImage("src/main/resources/XXLChess/w-queen.png");
        this.w_rook_image = loadImage("src/main/resources/XXLChess/w-rook.png");
    }


    public void buildPieces() {
        //this

    }

    public void setup() {
        frameRate(FPS);

        

        // Tile tile = new Tile(1,1);
        // Load images during setup

        PImage spr = loadImage("src/main/resources/XXLChess/");

		// load config
        JSONObject conf = loadJSONObject(new File(this.configPath));


        //load images

        loadImages();

        
        background(160,160,160);
    }

    /**
     * Receive key pressed signal from the keyboard.
    */
    public void keyPressed(){


    }
    
    /**
     * Receive key released signal from the keyboard.
    */
    public void keyReleased(){

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    /**
     * Draw all elements in the game by current frame. 
    */
    public void draw() {
        //System.out.println("hi");
        game.drawBoard(BOARD_WIDTH, this);
        

        
    }
	
	// Add any additional methods or attributes you want. Please put classes in different files.


    public static void main(String[] args) {
        PApplet.main("XXLChess.App");
    }

}
