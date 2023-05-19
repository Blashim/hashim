
// package XXLChess;

// import processing.core.PApplet;
// import processing.core.PImage;
// import processing.data.JSONObject;
// import processing.data.JSONArray;
// import processing.core.PFont;
// import processing.event.MouseEvent;

// import java.util.concurrent.ConcurrentHashMap;
// import java.util.concurrent.TimeUnit;
// import java.awt.Font;
// import java.io.*;
// import java.util.*;


// public class Tile{

//     int cellSize = 48;
//     int[] tileRGBcolour;
//     public HashMap <String, int[]> tileColours = new HashMap<>(6);

    
//     public Tile(int tileCoordinateX, int tileCoordinateY){
//         // this.tileCoordinateX = tileCoordinateX;
//         // this.tileCoordinateY = tileCoordinateY;
//         if((tileCoordinateX + tileCoordinateY) % 2 == 0){ //white tile default
//             tileColours.put("white", new int[] {184, 151, 114});
//             tileRGBcolour = tileColours.get("white");
//         }else{
//             tileColours.put("black", new int[] {128, 96, 61});
//             tileRGBcolour = tileColours.get("black");
//         }
        
//     }


//     public boolean isTileOccupied(){
//         return false; //change later

//     }
    
//     public Piece getPiece(){
//          return null; //change later
        
//      }
//     }

// class EmptyTile extends Tile{
//      EmptyTile(int coordinate, int cellSize){
//          super(coordinate, coordinate);
//     }
//     @Override
//     public boolean isTileOccupied(){
//         return false;
//     }
//     @Override
//     public Piece getPiece(){
//         return null;
//    }
// }

// class OccupiedTile extends Tile{
//     Piece pieceOnTile;

//     OccupiedTile(int tileCoordinate, Piece pieceOnTile){
//         super(tileCoordinate, tileCoordinate);
//         this.pieceOnTile = pieceOnTile;
//     }
//     @Override
//     public boolean isTileOccupied(){
//         return true;
//     }
//     @Override
//     public Piece getPiece(){
//         return this.pieceOnTile;
//     }

// }

