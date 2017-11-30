/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainstations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 *
 * @author jim.stewart
 */
public class TrainStations {

    private final InputReader reader;
    private final OutputWriter writer;
    private ArrayList<Station> stations;

    public TrainStations(InputReader reader, OutputWriter writer) {
        this.reader = reader;
        this.writer = writer;
        this.stations = new ArrayList<>();
    }
    
    private ArrayList<Station> buildStationList(int[][] input){
        //build station list here
        ArrayList<Station> rtrn = new ArrayList<>(); //this is the list of stations that will be returned
        //TODO:
        //for each array inputItem in input
            //newStationNumber is item 0 of inputItem
            //int newConnectedStation = item 1 of inputItem
            //Station currentStation = null;
            //for station in rtrn
            //    if station has newStationNumber
            //        set currentStation to station 
            //        boolean stationIsConnected is false
            //        for connectedStation in currentStation connectedStations
            //            if connectedStation equal to newConnectedStation
            //                stationIsConnected is true
            //        if stationIsConnected is false
            //            add newConnectedStation to connectedStations of currentStation
            //        break
            //if currentStation is null
            //    currentStation = new station with station number equal to stationNumber
            //    add currentStation to rtrn
            //    add newConnectedStation to connectedStations of currentStation
            //    
            //    now add this station to connectedStations of the other station
        return rtrn;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputReader reader = new InputReader(System.in);
        OutputWriter writer = new OutputWriter(System.out);
        int[][] input = new TrainStations(reader, writer).input();
        //add your code here to turn the input into a graph of stations
        int x = 0;
        
        
        
        writer.writer.flush();
    }

    /**
     * <p>Input will begin with the number of stations on the
     * first line, followed by a line for each station containing a 
     * station number and the station it's connected to. For example: </p>
     * <p>3<br />
     * 0 1
     * 0 2
     * 1 2<br />
     * </p>
     * @return a two dimensional array of each line of input
     */
    private int[][] input(){
        int[][] rtrn;
        int numberOfStations = reader.nextInt();
        rtrn = new int[numberOfStations][2];
        for(int i=0;i<numberOfStations;i++){
            rtrn[i][0] = reader.nextInt();
            rtrn[i][1] = reader.nextInt();
        }
        return rtrn;
    }
    
    /**
     * Station contains a station number and a list of integers for
     * connected stations. 
     */
    private void addStation(int stationNumber){
        if(stationNumber < stations.size()){
            stations.add(new Station(stationNumber));
        }
    }
    class Station{
        private int stationNumber;
        private ArrayList<Integer> connectedStations;
        public Station(int stationNumber){
            this.stationNumber=stationNumber;
            this.connectedStations= new ArrayList<>();
        }
        
        public int getStationNumber(){
            return stationNumber;
        }
        public void setStationNumber(int n){
            stationNumber = n;
        }
        public ArrayList<Integer> getConnectedStations(){
            return connectedStations;
        }
        public void addConnectedStations(int stationNumber){
            connectedStations.add(stationNumber);
        }
    }
    
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    static class OutputWriter {
        public PrintWriter writer;

        OutputWriter(OutputStream stream) {
            writer = new PrintWriter(stream);
        }

        public void printf(String format, Object... args) {
            writer.print(String.format(Locale.ENGLISH, format, args));
        }
    }

}
