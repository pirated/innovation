package com.algo.graph.snaleladder;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 6/26/17.
 */

class Entry {
    int v;// Vertex number
    int dist;// Distance of this vertex from source
}

public class SnakeLadder {


    public int getMinDiceThrows(int[] moves, int n) {

        boolean[] visited = new boolean[moves.length];
        Queue<Entry> q = new LinkedBlockingQueue<>();
        Entry entry = new Entry();
        entry.v = 0;
        entry.dist = 0;
        q.add(entry);

        visited[0] = true;
        int count = 0;

        while (!q.isEmpty()) {
            Entry e = new Entry();
            Entry current = q.poll();
            int v = current.v;

            if (v == n - 1)
                break;



            for (int i = (v + 1); i <= (v + 6) && i < n; i++) {

                if (!visited[i]) {

                    visited[i] = true;
                    e.v = current.v + 1;
                    e.dist = current.dist + moves[i];

                    if (moves[i] == 0)
                        continue;

                    if (moves[i] != -1) {
                        e.v = moves[i];
                        break;
                    } else
                        e.v = i;
                }
            }

            count++;
            q.add(e);
            System.out.print("vertex : " + e.v + " , distance : " + e.dist);
        }

        return count;

    }
}
