public class InstancesFactory {
    Object getInstance(int index) {
        assert (index == 1 || index == 2);
        switch (index) {
            case 1:
            return new Instance1();
            case 2:
            return new Instance2();
        }
        return null;
    }
}
class Instance1 {

}
class Instance2 {

}