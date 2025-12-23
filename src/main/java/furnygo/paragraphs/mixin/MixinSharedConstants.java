package furnygo.paragraphs.mixin;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SharedConstants.class)
public class MixinSharedConstants {

	/**
	 * @author Morgz
	 * Makes you able to "chat" § etc. (normally "illegal" characters)
	 */
	@Inject(method = "isAllowedChatCharacter", at = @At(value = "HEAD"), cancellable = true)
	private static void isAllowedChatCharacter(CallbackInfoReturnable<Boolean> info) {
		info.setReturnValue(true);
	}
}
