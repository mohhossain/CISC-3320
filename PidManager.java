import java.util.Arrays;

class PidManager
{
    // Declare the range of possible pid values
    private static final int MIN_PID = 300;
    private static final int MAX_PID = 5000;
    public static int[] memories;

    public static int allocate_Map() {
        memories = new int[MAX_PID - MIN_PID];
        if (memories.length == 0) {
            System.out.println("Memories not created!!!");
            return -1;
        } else {
            System.out.println("Initializing..............");
            for (int i = 0; i < memories.length; i++) {
                memories[i] = 0;
            }
            System.out.println(memories.length + " memories initialized");
        }
        return 1;
    }

    public static int allocate_PID() throws Exception {
        try {
            int pid = -1;
            for (int i = 0; i < memories.length; i++) {
                if (memories[i] == 0){
                    memories[i] = 1;
                    pid = i + MIN_PID;
                    break;
                }
            }
            if (pid == -1) {
                return -1;
            }
            System.out.println(pid);
            return pid;
        } catch (Exception e){
            System.out.println(e);
        }
        return 1;
    }

    public static void release_PID(int pid) throws Exception{
        try{
            int index = pid - MIN_PID;
            System.out.println("Releasing " + pid);
            memories[index] = 0;
        } catch (Exception e){
            System.out.println(e);

        }
    }
}
