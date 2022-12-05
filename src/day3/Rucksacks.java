package day3;

public class Rucksacks {

//    public static char duplicateFinder(String item) {
//        char duplicate = '/';
//        int length = item.length();
//        int halfLen = length / 2;
//        for (int i = 0; i < halfLen; i++) {
//            for(int j = halfLen ; j < length; j++) {
//                if (item.charAt(i) == item.charAt(j)) {
//                    duplicate =  item.charAt(i);
//                }
//            }
//        }
//        return duplicate;
//    }

    public static char duplicateFinderFromThree(String item1, String item2, String item3) {

        String duplicateString = "";

        char duplicate = '/';

        for (int i = 0; i < item1.length(); i++) {
            for(int j = 0 ; j < item2.length(); j++) {
                if (item1.charAt(i) == item2.charAt(j)) {
                    duplicateString += item1.charAt(i);
                }
            }
        }

        for (int i = 0; i < duplicateString.length(); i++) {
            for(int j = 0 ; j < item3.length(); j++)
                if (duplicateString.charAt(i) == item3.charAt(j)) {
                    duplicate = item3.charAt(j);
                }
        }

        return duplicate;


    }

    public static String input = """
fzmmmfwDWFzlQQqjCQjDGnqq
tJHJvLJVVttNsvTtTvgHHSVwCsQRQQZCZZMqQMQBnqBMQs
LgThNJhNSgTJVgvgtghPhbpfWzfbwfPmpprb
lDLnSnLZRjmWrlhrFF
PffQJNqJbPZbpmjrrCVNFmCh
qzbcbqfMfZMTfQTqqzzTPPLMHgBBBtHRStvgHRDBnSRL
WPZfJlZZCMwwZPWCwWzVHQhsshVSsfNQHdvQNN
FLGDGGnGdVjQQQDQ
ccFFbggLnRcLFRtFBmnJzdZZzZBMpwJlZMppMp
RZsnCZssCnDccJCnfcQfHTdzMzhdLdMTqdRqpRLwqq
tNrGNrrvGhTThQqw
rrFStPgrFWWgvmPgQjtmNtmJcfJcsJsZblDZfbfHDFHnfl
RdTfgbbPbJWDDqRvsDsmVG
NSQZLQZHpFGLqnLszrJm
ZMSNMHhNZMMSQwhQJWPBJCbhbcgtgfcJ
qZfqPvLnnZGpGpCJlvsMsMlHJJHB
mTWFFFTTtVSJMzzjWgSH
RbVdtdFtcrmbRQDDVHDQTbDNwLPLfnqZnhZhQnNwfNqnnn
nhHfSGHGThhZjnhrrSnsSczdzlfzzdQQVzRNFNcFdl
JJvCDvmCbtvpvbMmDvLbCJpmqdVVVcMcNGzRcNFcRRzRclQd
vwDCwtLmwLBDJmCHHjHHWGZHBnsnnj
QWTMqZhThbTbLwtGBrQfQQNr
jdzSSccVPPcgcLrDBtDVwCfNNC
vcBgcmssccplTnnTqsMhWW
FlcwZhBhGZhFJnGtZZFwlGsWRLHdWqMzPjWRLTLJHHjdWq
vfmrmbpfpMfzjHjfdM
VCSmVpmrNDMZhSMcsFnh
nHqQVtVZGGwwwnSF
fMBBBWCsCfMMbWfbsGmGzFjQGQFCPhFQhF
fbcsWpJRsWlcNVLtqtLLQcZQ
rgNJdfNJpgpJVMMVfmfVJgCtCTqqqzwTqrBsTswcCCss
lFLHGWLvHQFhnQFhbFnbHWWPBtwqzBPTcsPTswZCPBGCTC
QQtbRtLhtjgdfMRMDV
jTRhJpGhQPfPLsDhWh
wVVMbqbHwVwwMplHWfsfNmWcSLqcLmSs
lVCZlHnwHdRpRGvZTBGJ
csppppDDbGLbSqndFHHNdHsH
lVTlgWgjzCzfgvfggZWWlnHPPBHrSCqBmrSBrHHBnF
QFgvFfjTvZjzlvVTWljvTtMbLcccbRRMbwLMMLQLbw
tjhLjLJzpJpwjsqqfQqNrNfRnsRR
WvwGBPwWZZrnbBNrNnnC
PDvGVTgvTMGvZTGTPvWDZVJjljtLzhtmLlJjwJVJLm
WbzpSNswNWszwSLgSNMcrrBfPJJcfsHMrvMv
CFllhlGFDVFRCmhQDlDTBBcvgBCTcHPHrfrHTJ
qGRgVFhDDZmDnDqhgQFGqzwtzSjddwZbzwpLNzjpdS
FlpZrQSJJmQpSpqlQgbbRZCgGCZdDdbNdd
WswHfjfnhWPFDsFRDcbBbR
WjHvjjWTfTvHFjzvPnPtttVTTJVLtJSpmtlltp
tnjrnnnnhNlPBtbbcWpZScpjbZSz
wmsFqfqqqGHTLbzpLLbgzMcH
FGJqsmQGRVFwwQJschPdhPrBndBhtPhrQQ
dRdJRfTnCRNlJjPBDmBJsbBDzm
wSFWSgGVSLwpFhpLhQjzgPzbtDPDbPBsztrP
WMGvVMLLBCclNHHRlM
gfSffQBDBtZvwwpWDHcbwb
JnCmmJCRmztsVPJRFjFchcGGWFWcGcHFvGLvHF
VCPzJnsPVCjtPjdMsMdmVmMBfgTZBTMfSfZSSlfNNgSSfg
lwHJSVZHWWVwJQwbbVVtwWVVdpdPfRfgDLPZLTZLDLgRDTZL
hhBrBqRcnhsFFfddmdmmCmmppn
MNNBBRRshNHbtVMzQJMM
NBsSNtLNTtNsvlTBBRLgFSCbFmbHFCFhgcghSm
WJWWDdVzDZJjDJQcCDHmmhCnmHmHFm
zQVdQZQwqVQHjqzWWWdHpzMwGMBlGLLtTvRvRNsMwwNN
ZCztttSjGSqRZgRPDNQQNr
hLvmHshLmLcFwwhhwLqMVRRRJQQVNnRJMVRDNNRr
HFhTpFqqLcssmqmFftblBSjCjStjbGWBfj
crffjHDfrQfnfpLPgbgP
TmFvFCmFTFFCtNsmMsRvlRTpPbLGMnGSngPppShGpbdgGJ
vmslmwTNmtstzFsCvRFrHBrDZzcQnWqcDDHqQB
LQLPVLGdGrRPRhHgwMhllhhs
ZbSZTNqSZfNqNCtSSmTttbpSWMlzWlslpWHsWgJWhwJzBMlz
bqjqqFFjHqTTTZTmSNbfmdrFQnDdcvVDGQDvvVnQnr
mQdcdsSThlccSWhMgDnQnFtjQPtnjPNvtR
zzsGwzrrHGBfZJGrJpDtNHFjvNvDvVRvNRtV
wZBCGrbrszTbThcTcLcb
gJDDDDcPQgQfNFPhhZGDDcZZSLVtlCqzsMlzqpszlsVtFSql
bBrdwHTrHWTrTtzLlSMCCCprCq
dnBwRvmnbmBvTpbnbWbTjZPQJhhchmJcmcQPfmGNcJ
sjMGBLWGZjsLjJTBCCbvNrBCHC
mpcRfDSSdqDdlRqdwRvFrHFbrHJFJVvDVrTb
qvlgqwpcSQSfLjjhzgnMzsnP
VgmLHHNRNVLNhsNgRHLltjjbCWnCWZbldntW
GGMFPJqPwJGTvvCCdqdqlqCj
rGwGrMQzJQBjJwTVHgDQDHcsfhVhVg
pblwGBlFlWwwlgCSFwbLvQZFvzvZhzvmQTLLzJ
HfqccHzVDNqLmmPmPPQZ
MNtrVdDjHtrzGBdbGWCblw
NNhnnLdnnfhdhVjvThvqVvCj
tHtHBzBGWHBWGtPBSvvpGZVbSsTFjSqqVbscgjCjqqSC
HBtzJHzzpDZpzMWpGPtWHvZwQmNLlmQnmNdfMmNRmwmlwd
QzGqGwmbfTdPBgRRcgmMPC
NtNZhljrNjrSrtltWlCJCJJfcVVRcJcRgPjf
NlWSZZWsHhWWlprSSvZWHrWfQLLQbLGfQpQzzTFQbwzQdd
gcwcSnccnwLRRSzcBQRvZZdvtNtvRbQJQv
CqrCrrPsVstvbfDfbb
TPlPVhWFFMGMnMjbcT
gjjHGvcHgsgbSRQbRFWbjC
ttnBTNSSfwBLzplWPPdlLlMPlMCQ
TBZpDtmnnZNvhJDHggqqgS
zfqzzGwMbllcJFqm
NpHgpRZrRpSrSZLghlTjchNlNbhFmchb
RHLWHgLBggZpHpgHRZrLgZLQCMzCfDWGMCzMQQGvPmvvfC
bBWWlFFBBFdVMLfvsfjrtBvTrr
qZsgNZzcwfjZrfPf
gcnNNcDncsDGzggDnNRJnzHhmlMVSSbhVVVmMbbhVmMlGl
dNNRQszqRhPNfddWltvDltMMNlnncv
ZjZbpgpSpjpJgpCCpbFlTnSDTlzclDnMvnnMlT
GCJpjbgzJCpwZwrHZrgHsRBwBVRRsqdqPhLBQqsP
mnnVCcwGwnsVJntmfnBtBhTDzpzzpDWbDbsLLzpWDz
FcHQdZSRHbhZZWWhrW
dNljMlPPHdMPvRlHMRdjRRNBnwJfCVqwqqffCfCwtcBV
ZGtGzBBGjvdZvLWLcrPVcZcsNVNmVpcH
MnlgngCJMgJbhfDbCDPrHHVcNNrVpbVpVmmcVq
lSPhlClftSSBvdGS
jFhGqVCcPMMdGFqczBltzrtglrsrjBgB
wWgwvfDZvnpmnHwHTfNpDbtRWbzltRlSrRlbBSbbzt
fHJvJvvTwwJPhCccgQCM
BrrrBVgNppDVBbTgDvqWdWZqWqwNmNNHvH
sHsHnHlcJjFwMMFFvGdPvv
HllCQCJQJsnjgtVTbBgpQrSr
JgLPLwbhBrCbLBCJPFFlPFZRTNTZFRqlRq
pmffSWvDcfSfGmvsNHZsTRsWllssbT
vDddMmScdStfzGcpzzwhJwJwnCbLwwLLCwht
sWSSvmsZsdZPWdLPRRsmSrrnlnvJjfnggfrgtfjnjr
VWWWBhhHBBHtljMMfJHrrt
WWqpWVqQqLNGRNZP
QHjjGVBQpffpjqppQsSsQHWJcVVgJFWcFTWgNLggFPNc
bzzmbzzZnZztFTNJWRqmqcgJ
zDZlqMtbwhCBBfppvHDGvf
BNTdfWJmzHNHHzzTdLCfCfCswQjRjljVsh
FbGnrFnrPGSSvGPFZFFPGClLQpjQRwLjLplQhRlsrQ
GbnvvgvPFwbwcnZMMGSFvFHdNHmTBNJNmmmDTJDBmWcT
rBhRPrjJrRtTHtWHWcjc
SDdGqmhdFSqblLGlHHfHWl
DSSmFqhsFqFdzqFgwsVnvBQPPQPQVrnRsJMR
NZcgQdmSwZgdPFPVNFPqqVVF
hlhhjMhGjLhLDGDhCBJDCrRFRrqqpLPfpfPRVPprPm
MlhjlMDDJTCmZddQQSTcTT
zRddrwzwNhrzrtCLtLfsLrqflC
MbSDZvVwGZpJwvHvBVfsqtjqlsPPfsqsfclb
vJpvJvZTVgTdTgwdTn
SZMsTTScDMqwtDDJ
VWrbzFvnrvFQQtnhzdPFmfwGfqmGPfDwmfPJ
rrLbrnVrLvVQpLHSHjsTBBjZBt
bSrpbWpPpfzPRWrWvhJgddrcccgFnFss
ljGNTCtMNLGQjNMjQMGtZJDDggcldcFcvhdFddnhhF
vNCmQMjmvGzpRPPzzmfw
BrbdcqcdSZRLQltNDqFpCpHH
jnTzWsWjWjwTQnzMvFlCzNDhNhDCFGpHpH
wmmvjVQMvwmsQMMwnsTPgVfgJcLcgfSbbBdBbJSdbSBS
bJFbMdcmgFSFgmggJFcGwjRdzPWZWGDDGGRwGD
hrttffCVVCTVlrttQwzRzwWTqRGDGwjTvG
rfLChHhlpHrfHlnWlpWCpQVcMSmMmSJMmggbmMSMLFNSSs
JRMBJfMJQJTcNNdD
LHsLmspghmmpdwwwcwRCpPTT
ttLLlRSlqjrMqFtZ
VjtHVHtvVqttCdnGpHtplcshglNgprrlMhrcNghw
WTWRvRWFZQLWDvDWzwscNfcflcshlshFlw
WQmBQWPTVGnJPnvn
cpRwjcQwVfQzQPQl
BZgGDBZBsgWBDDJzlhfhJVmzVfmThm
FqWDDGrGDFNqFrDZFnplNHnSwtnSRwRplN
VMLVRhRLRfhfgGdfVdZWRdTHNqHCDTrSJNBBBgJNQgND
swlcpsFPcPwzpSlTTDrNrQPQqQBBrH
zsppFscsscmbzsFsbsZbMfRZdVdVMbVSWhLG
NjcjHFjrHHFpjGtVtGWVZW
fwPlsJqdndPnwJfQdfllwNtWGdtWMMbtbmbGWbMWGN
CPlwnCwnwqClTJThTDzzFcHNSShrRh
llqlsNsPNTpDNTDNNf
cnvcWFjSrMSFnvWHTzTggHCcllzLpg
wjJSSrFrrMMJGrFFFGjGvJnFswsRwRdmBdZbbqqsPtQqPZls
jlclpqjcRqpjzjnVPgTmBmjCrC
vGvsFNGGMZNvdGshQNJvJgbVMrnbrHVBgBTTbBBPBT
SvJNGhvvvFdfQvFshSpqPqLzRRPctRcLWwlf
LWSSqLVBbNqqLrWHLSHzWbbqQfFgZtmtJCQZzgtCFCQCCnJQ
PlldGDGdjGsMPhssjPmQZFJQQZQghChZQJgv
jwMcMpsPRRdsRjPwNpTWBLSBqVqTNJWT
hWnMWgTffWFbMLfHnFMNfHgjtBSNRzjBBSzSBBcStdzBtz
VGrVCGcVJswvPqJQjtQppBzpSwdjpt
ZqqsCrmmsfmWcHhngg
vnNnssMcZnlnlMFMsnFcZMGqJCbLbNLNqgLbgLNTCpLgwC
hmjzBzHmRSfBfmqgQwpQQJbQJmwT
WVVtthRtRdsdqtddZd
LhZBLfZpmcsFpFzm
vTRRwTRRPnCTwlFgmsczzLmgLvFs
HVVVNCPPHTTtClRVNSnwLTHSQHBMMHrHWBhrQbJhWMMbZbJZ
WPTnnDPjvPlChhJPcgCC
DRQdBqsDQHQLHsBSmVLBcbwgCClbgCGlJghgmhgw
dHMHQDVVRBsMWTNfWfzWzf
PlgFPFFJGgJhhMGZwGbpBtQjjjStBttptlSb
TTcDzmHvdvnDDzdTVnTDmSspWspQLpWmSsmqppsWtb
CHVdcHvdbrwJCMPRGJwP
BtBfcPfBhBGDhwHMlCmrNSCM
dQdzLFTQnRnQVvgLnNlrCCpFrJCNrHJrwm
zRVLZQRRvQGbwtWfbGZb
PPcWcwMmCwwgnphCCLpjHp
TtZsJTzzJSSSZJsdJtTrpblhRlHHHMngpLnnjHps
ZDrvdFZtJqtStrZfMcGDVwfwffmWmP
wCwSzzsHChhMVMhCPsSVLFWcdcWGPccRdjFdJjDR
wBTTlBfgTlfpQQltmfgGGctRdGJJJFDJDDWdDt
TppwnmlnQQqnlpqlmmwqlpphHqrVrZZSzshzShqzsrZVqs
CCqCTgmdMCCCMMsWgqqnTCmJDGJcGGJfrGNGrSrrQpwFFSwG
vZbDZvhDbzHzwNzwNGFNpNGc
ZjBRVHPRtRLjLMWsCDlmgMdBmW
MMsstRChwbChqRBqDrJNpNDsHdlNlJdr
vLmPLfGGGGcTmFfTSgvPCvpZQlHHZpdrFJplQdZHQdHH
GgPLmvGVSPfmfcfgBtjwCRwwjBbtVWbh
LPPgFPccLPRswfsHfJgDsH
bpbpTnCCrnmCtjBnTfDshHDwQVTwsDhQ
BbrjnjnWCbBWZbPWzLDzDWdNlMWS
pnncvLbcppBHgBRpddGd
MtJfjVMtMmFJDjWSjVWzGdGgNQRBzBGNBMCGNB
ZdDdsJFdDmtJmLTbwcvcbcnwZv
FGsfFdNdhfbDdbhbLMhbNNTPJVCCZTLJnCRVJLPCRTVR
qHjsczptHpmgHZBBVVTrrPzrBP
lmpSlcglQtqWtcWjpQQfWsGDMhGFwdbGGNWhDv
hNNNjMFMwthjFfvZBjFFvNSdnzSGGdGmHzHgGWSfHWSR
ppJpcCVslpQJpJJDWHCHmRHHWWGSDn
QbsrJQTQJVJNMNnZTZNZvZ
NmRNLtGNmfcRrtDtrJCnWHJD
blSzzSBssgfslWCCCJWFWHrsZF
zTzbPBhMlTVSzMlMldlgMvvvvMLGcQRmqLLfvRwQ
nnZsfsPLLfZfHLWdsZWZHdmcSpTcGmNScJTRGsTJmNcF
gqVqDMgBlDbwwCqVbQFpTNFcTRSJNSrqqTSm
jlMVMjljQBjMwhLfWWzhhfhZtmLH
bfHwMvzwFBNpRjfZ
nddcVJpGVpGqPVBBFBmhBhmsNRJs
DWcPgPcPgnqCPlWWVWGMwbzwvQSSLbvgLpHHMz
NMVqtdPVHgVlrfVrpnjCwNjjpCpNNpCb
zhSvfWWzRfRLfvSpQjwbmmmvQvwwCD
LBRRTRcLJSgqqMJlVVft
GpgNzzSMGpGTrgzgMzJTrPgzjRwBdBlBbLRBjdBwVbLRVbSR
sQWCfQcflhtQQcWCmsmlsbLnRdwqqBmmbBVbLVLwnB
fCtQWFWDZFCQhCctFDsftNpzPPzZJpgJJNTgNlPZgH
DqLtMSDLLttjdDSRdjZtdpdqVWFslFWrqWPqhwhfFwwCFw
CvTbNvvTJNGHnVJwPfwFFFwsrh
cQBzGBHnTQGgcNtdMMBpDBtCdtLL
QsNDfdDNQsSTtrQZQtJJZC
lLvRWMVMLzWbRjvVgVVGvmTtCrZBrTFFbmJCmsBCrr
lljvlgpMGgRpsjsRlGGsMdqDdpDqNqfhqqSdncpqdP
sVSJVmmtmsCCwschrbNMbcBs
ZgLLfqvzzqgfdqHQLnTLfQQFhFMrhbNGBwgGbMlNcFclwN
LTzqZrHHQvjLHnHdQTdTQvZQJjCpCJDPmCRRtCpStRRmVtmm
ccQVcVHwnnDqNqSWNnVvqwcgJblgRslgmdGlssmGbQdddb
rpFtPrzrMFZvZTLPpglhdssFshssJhsggG
pTtLtBMjZLfHvNWqcBHf
PZnSjnnsVfjfLLff
crvccpglrtHfNbzbHLzmGN
lptTLFFpdgvttFWltTclplDvhJMSMPhJPhChShPBZBMJhPMT
mPSPdnhznPdhSmPGchJdFDtBhghgFgWpFBQhTBMg
rHNNvbqHHHwZwMGMWtgtQMZQFQ
wRqqRffvvNHwrHqrNqLvCrqvmPnzdsGJsSsSdSsLPVVPnjsn
CzlngWpClJlzRJpDnpmzCndrhBcrhwcsBcLsNcsmLdQQ
qqSjqFGTFbPFSPTVjcBcBsDdQrwBVLrNcc
PtDDtZTvGDvFCMzZlRJCfWfJ
vtQDpvpvVvvcSFrrljZZsVjFrV
RqcTTRddRrlsjZrwrT
zmbdRdMmMgbPDcGhGmnDpcQn
gZqJRZRZdltFVGZQDZwV
MCMSRHCMRHBBVtVCGwDCFGtD
jcHsTMBNSSrBMjmMrcTMpRqpJggllnprqzRPzdlP
mWSWHdmHWZWjBnGs
TvchwtTfcTvhzwVGNtdrbjnnBnsnNr
JTdwghvMzwfdcMVJqPmQFRPpCDJRJFFC
DsHDCrszvvhHsshvsrrsgwdPpdLFgWLpbRpWFfMjWjWF
BVJPJmPmGZVnfbVfMWpdLMWb
cNGtnttqmJHNvNzDPPHN
gpjmMQMrfmMntCSCNmSNCm
vDRqphDhzHSdtqdCNH
LFLLcbJRJLppFQlpMFfF
SnSdvchzZZczndNvwcwnQrGfqrTTfhhTDgRGGLQQ
lVWHWMmWmttsFBMLLqLTRRRqqDBGTf
bsFPbFFssmFjWRmjVFjHbczvpZCwvwZccndpvzpzCP
jzngbHrlHQllcbcTCtHGWtftGCHqWC
JJgmsJRwFqChLGtqGs
SmJmSmDdSPRwSMppJdPPwVvvzNQvjrNMNjMZZrQgZNgQ
PvPlPcZPZFllzNzCDdhhdHjrpHNjHBHB
VmgWtJWrqbQmqGDBdGQjjhBGdG
tmbgggbgnMWnStttgnfnTzrCfPvFnccnPclT
RQQbdSRdpprQSNVqqqfrffjvnjnJnhnVvHhBhVjJtjJz
WGgGgLmLgGZMPDBhDJDHjMBFnD
WPPwPGwlLgZwmWlslCLRNbrsTrfRrNNQqsspBT
dNNpHpchLppdccTNtZZTRRPSSnwPPSbSnhhrhnSJ
qfqsFsqffgQMznJrPznbMrrB
vglfqQCgDgFjglCDCjLZpTHNPHttdcZVVN
FWtDHDStZwrFCDwrgWPFDsWQJZzlMdpZzlNpNjdjjQzNzj
BqnVGVcbTmGfHLGVzvpQpvJvQlflMdJp
ThRRchnHqLTGbFCCCrrSSFhFCs
wJrwdZPnJwqPbJPCnjFZdvHtMvsLsTsDtHsHDDqvpH
RWzNRWjRfgjNMMLvcMcLNt
WGGRQzzRmRmVQSgwrwJjjCbJhnbShJ
cjngcvcwbMwWnbMWjbgvnsjPftsqfthqsBtsJJJJBt
HrGFmDDzpmLTHpDsPfsBNBPfzZNPqN
DDVmDplDrpGSVSTTHGlpLnPwCRnWcvWCdPbbMvcVdW
BVRlBfPBffWswVWQsfwBNNPMFMmmGFZGnWZGtztrzMZMnz
HqSJchHTHbTgHhGhvmRzFmnFtzRF
RJqHTpgDLJDSqLJJPNVjsfPwBVsVLlfN
NDrBlSmrFBlbbJllmtHHwhNNhZztqHVRzQ
CMTCGLcvvtfCdCcCvCnMTMcTzjHwVZVRLjRRjQjRHRwzwjVH
dfGdgGMGPggnvfvgbtDtlSJPDSFJPslJ
                               """;
    public static String input2 = """
vJrwpWtwJgWrhcsFMMfFFhFp
jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
PmmdzqPrVvPwwTWBwg
wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
ttgJtRGJQctTZtZT
CrZsJsPPZsGzwwsLwLmpwMDw
            """;

    public static void main(String[] args) {

        String[] inputlist = input.split("\n");

        int elvesCount = inputlist.length;

        String allCases = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int counter = 0;

        int start = 0;

        int middle = 1;

        int end = 2;

        while(end < elvesCount) {
            char duplicate = duplicateFinderFromThree(inputlist[start], inputlist[middle], inputlist[end]);
            System.out.println(duplicate);

            for(int i = 0; i < 52; i++) {
                if(allCases.charAt(i) == duplicate) {
                    counter += (i + 1);
                    break;
                }
            }

            start += 3;
            middle += 3;
            end += 3;
        }

//        for(String s : input.split("\n")) {
//
//            String cal = s.trim();
//
//            char duplicate =  duplicateFinder(cal);
//            System.out.println(duplicate);
//
//            for(int i = 0; i < 52; i++) {
//                if(allCases.charAt(i) == duplicate) {
//                    counter += (i + 1);
//
//                    break;
//                }
//            }
//
//        }

        System.out.println(counter);

    }
}
