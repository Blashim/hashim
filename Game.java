package XXLChess;

import java.util.HashMap;

import com.google.common.collect.Table.Cell;

import processing.core.PApplet;
// import XXLChess.Tile;
import processing.core.PImage;

public class Game{


    public Tile[][] initBoard = new Tile[14][14]; //creating the 14x14 array containing the soon to be initialised Tile obj
    public Piece[][] piecePositions = new Piece[14][14]; //have a way to locate pieces without using pixel locations

    public Game(){
        

    for(int i=0; i < 14; i++){
        for(int j=0; j < 14; j++){
            initBoard[i][j]= new Tile(i,j); //creating a 2d array of Tile obj
        }
    }
    }
    int tileCoordinateX;
    int tileCoordinateY;

    /*
     * calculates the position of each pixel for each tile and calls the draw method for Tile
     * @param app to invoke draw
     * @param BOARD_WIDTH to make the board 14x14
     */
    public void drawBoard(int BOARD_WIDTH, PApplet app){
        for(int i=0; i < BOARD_WIDTH; i++){
            for(int j=0; j < BOARD_WIDTH; j++){
                tileCoordinateX = i*48;
                tileCoordinateY = j*48;
                initBoard[i][j].draw(app,tileCoordinateX, tileCoordinateY);
            }
        }
    }
    /*
     * to create the rows of pawns on either side of the board
     */
    public void buildPieces(int BOARD_WIDTH, PApplet app){
        for(int i=0; i < BOARD_WIDTH; i++){
            
            piecePositions[i][1] = new Pawn( app, i ,1 ,false); //for black pawns
            piecePositions[i][12] = new Pawn( app, i ,12 ,true); //for white pawns

        }
    }

}

class Tile{

    int cellSize = 48;
    int[] tileRGBcolour; //int list because RGB is 3 integers
    public HashMap <String, int[]> tileColours = new HashMap<>(6); //to create a key-value pair between the colours and their associated RGB values

    /*
     * @param tileCoordinate X and Y so we can have pixel locations for each tile which draw() can use
     * logic of how to colour tiles 
     */
    public Tile(int tileCoordinateX, int tileCoordinateY){
        // this.tileCoordinateX = tileCoordinateX;
        // this.tileCoordinateY = tileCoordinateY;
        if((tileCoordinateX + tileCoordinateY) % 2 == 0){ //white tile default
            tileColours.put("white", new int[] {184, 151, 114});
            tileRGBcolour = tileColours.get("white");
        }else{
            tileColours.put("black", new int[] {128, 96, 61});
            tileRGBcolour = tileColours.get("black");
        }
    }
    /*
     * calling fill and creates the square for only 1 tile at a time to allow for different colouration
     */
    public void draw(PApplet app, int tileCoordinateX, int tileCoordinateY){
        //System.out.println("hi");
        app.fill(tileRGBcolour[0],tileRGBcolour[1],tileRGBcolour[2]);
        app.rect(tileCoordinateX,tileCoordinateY, cellSize, cellSize);
      }

    public boolean isTileOccupied(){
        return false; //change later

    }
    
    public Piece getPiece(){
         return null; //change later
        
     }
}
/*
 * future functionality for checking possible moves by seeing if a tile has a piece on it
 */
 class EmptyTile extends Tile{
     EmptyTile(int coordinate, int cellSize){
         super(coordinate, coordinate);
    }
    @Override
    public boolean isTileOccupied(){
        return false;
    }
    @Override
    public Piece getPiece(){
        return null;
   }
}

class OccupiedTile extends Tile{
    Piece pieceOnTile;

    OccupiedTile(int tileCoordinate, Piece pieceOnTile){
        super(tileCoordinate, tileCoordinate);
        this.pieceOnTile = pieceOnTile;
    }
    @Override
    public boolean isTileOccupied(){
        return true;
    }
    @Override
    public Piece getPiece(){
        return this.pieceOnTile;
    }

}

class Piece{
    

    PImage sprite;
    int i;
    int j;
    int x;
    int y;
    boolean white;
    
    public void setSprite(PImage sprite) {
        this.sprite = sprite; 
    }
    public Piece(PApplet app, int i, int j, boolean white){
      this.x = this.i*48; //chess board coordinates to pixel coordinates 
      this.y = this.j*48;
    }


    public void draw(PApplet app, int tileCoordinateX, int tileCoordinateY){
      app.image(this.sprite, this.x, this.y); //draw the sprite at the tiles coordinates
    
    }

}

class Pawn extends Piece {

    public Pawn(PApplet app, int i, int j,boolean white){
        super(app,i,j,white);
        // if(white == true){
        //     this.sprite = app.w_pawn_image;
        // }else{
        //     app.b_pawn_image = this.sprite;
        }
    }
    
