package com.yankovich;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations = new HashMap<>();

    /* when implementing an interface of course we have to implement all the abstract methods of that interface */
    public static void main(String[] args) throws IOException {
// code is a lot neater and finally block has been removed because of the good things with this try with resources
        // write to files
        try(FileWriter locFile = new FileWriter("locations.txt");
            FileWriter dirFile = new FileWriter("directions.txt")) {
            for (Location location : locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for (String direction : location.getExits().keySet()) {
                    dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) +"\n");
                }
            }
        }
        // OLD code
//        FileWriter locFile = null; // we have to have this line outside try block in order to have it available in finally block
//        try {
//            locFile = new FileWriter("locations.txt");
//            for (Location location : locations.values()) {
//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n"); // write data to a file
//            }
//            //we removed catch block because 'throws IOEx' specified
//        } finally {
//            System.out.println("In finally block");
//            if (locFile != null) {
//                System.out.println("Attempting to close locfile");
//                locFile.close(); // failing to close streams can cause resource leak, data can be corrupted or a file locked for others processes
//            }
//        }
    }
    // static initialization
    static {
//when we do 'try with resources' we don't need to close stream cos it performs automatically
        try(Scanner scanner =  new Scanner(new FileReader("locations_big.txt"))) {
            // read from file and put data into locations map
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
/*FileReader is just a Reader which reads a file, using the platform-default encoding
BufferedReader is a wrapper around another Reader, adding buffering and the ability to read a line at a time
Scanner reads from a variety of different sources, but is typically used for interactive input. */
        // read the exits
/*large chunks the data are read into memory by buffered Reader now this prevents excessive access to disk because
the data is only read from the disk when the buffer is empty otherwise the file reader continues to take data
from memory buffer so its much more optimized compared to just reading a character at time*/
        try(BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))) {
            String input;
            while ((input = dirFile.readLine()) != null) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String direction = scanner.next();
//                scanner.skip(scanner.delimiter());
//                String dest = scanner.nextLine(); // read on the end of the line
//                int destination = Integer.parseInt(dest);
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
