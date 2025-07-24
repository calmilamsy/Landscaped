package net.glasslauncher.mods.landscaped.registries;

import lombok.RequiredArgsConstructor;
import net.mine_diver.unsafeevents.Event;

@RequiredArgsConstructor
public class TreeRegisteringEvent extends Event {
    public final TreeRegistryEntry tree;
}
