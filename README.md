# CISC-3320

                                                                             <h1>PID Manager</h1>
                                                                         <h3>By Mohammad Hossain</h3>

Purpose: An operating system’s pid manager is responsible for managing process identifiers. 
When a process is first created, it is assigned a unique pid by the pid manager. The pid is 
returned to the pid manager when the process completes execution, and the manager may later 
reassign this pid. Process identifiers must be unique; no two active processes may have the same 
pid.
In my words, PID manager is responsible for separating programs and its processes. Each 
process is given a unique memory identifier and that identifier can only be reassigned after the 
process is finished. In this assignment, we create 4700 memory locations. The user then choose
how many memories to allocate for processes and then choose which memory to release after the 
allocation. After the memory is released, when reallocating the PIDs, the released memory will 
be allocated first followed by available memories for PID. 
Approach: Using Java, I created three functions allocate_MAP(), allocate_PID(), release_PID() 
functions in PidManager class. 
The usage of this functions is: 
• int allocate_map(void) – Creates and initializes a data structure for 
representing pids; returns -1 if unsuccessful and 1 if successful
• int allocate_pid(void) – Allocates and returns a pid; returns -1 if if unable 
to allocate a pid (all pids are in use)
• void release_pid(int_pid) – Releases a pid.
The PidTest class which includes the main function gives the user to use the PidManager. Errors
are thrown if the program cant recognize values that are out of range.
