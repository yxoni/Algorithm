import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static class Person {
        private int height;
        private int weight;
        private int rank;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public int getWeight() {
            return weight;
        }
        
        public int getRank() {
            return rank;
        }
        
        public void setRank(int rank) {
            this.rank = rank;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Person[] persons = new Person[n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            persons[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int rank;
        for (int i = 0; i < n; i++) {
            rank = 0;
            for (int j = 0; j < n; j++) {
                if (persons[i].getHeight() < persons[j].getHeight() && persons[i].getWeight() < persons[j].getWeight()) {
                    rank++;
                } 
            }
            persons[i].setRank(rank+1);
        }
        
        for(Person person : persons) {
            bw.write(String.valueOf(person.getRank())+" ");
        }
        
        bw.flush();
        bw.close();
    }
}