public class BulletPool extends MemoryPool{
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
