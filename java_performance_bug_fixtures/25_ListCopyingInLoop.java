import java.util.*;
public class ListCopyingInLoop {
    // PERF-25: List.addAll() in loop creates redundant copies; collect then merge.
    public List<String> mergeListsInefficiently(List<List<String>> allLists) {
        List<String> result = new ArrayList<>();
        for (List<String> list : allLists) {
            result.addAll(new ArrayList<>(list));
        }
        return result;
    }
}
