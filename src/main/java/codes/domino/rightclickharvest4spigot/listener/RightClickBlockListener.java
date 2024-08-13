package codes.domino.rightclickharvest4spigot.listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public class RightClickBlockListener implements Listener {
    @EventHandler
    public void onRightClickBlock(PlayerInteractEvent event) {

        if (event.getHand() != EquipmentSlot.HAND) return;
        if (event.getClickedBlock() == null) return;

        Block clickedBlock = event.getClickedBlock();
        Material clickedBlockMaterial = clickedBlock.getType();

        if (!(clickedBlock.getBlockData() instanceof Ageable cropBlockData)) return;
        if (cropBlockData.getAge() != cropBlockData.getMaximumAge()) return;
        if (!event.getPlayer().breakBlock(clickedBlock)) return;

        clickedBlock.setType(clickedBlockMaterial);
    }
}
