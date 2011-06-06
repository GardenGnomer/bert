package common.stuff;

//import org.bukkit.Block;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Material;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * <pluginname> block listener
 * @author <yourname>
 */
public class SampleBlockListener extends BlockListener {
    private final bert plugin;

    public SampleBlockListener(final bert plugin) {
        this.plugin = plugin;
    }

    //put all Block related code here
}

