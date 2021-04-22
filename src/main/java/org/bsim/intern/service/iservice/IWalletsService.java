package org.bsim.intern.service.iservice;

import org.bsim.intern.shared.dto.WalletsBalanceDTO;
import org.bsim.intern.shared.dto.WalletsDTO;

import java.util.List;

public interface IWalletsService {

    WalletsDTO addNewWalletData(String userid, WalletsDTO walletsDTO);

    List<WalletsDTO> getAllWalletsData (String userid);

    WalletsBalanceDTO getTotalBalance (String userid);

    WalletsDTO updateWalletData (String userid, String walletid , WalletsDTO walletsDTO);
}
